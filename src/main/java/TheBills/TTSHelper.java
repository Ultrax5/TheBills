package TheBills;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.speech.Engine;
import javax.speech.Central;
import javax.speech.EngineCreate;
import javax.speech.EngineList;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.Voice;

public class TTSHelper {

    public static void dospeak(String speak)
    {
        String speaktext = speak;
        String voiceName = "kevin16";

        try
        {   System.setProperty("FreeTTSSynthEngineCentral", "com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            SynthesizerModeDesc desc = new SynthesizerModeDesc(null,"general",  Locale.US,null,null);
            Synthesizer synthesizer =  Central.createSynthesizer(desc);
            EngineList engineList = Central.availableSynthesizers(desc);

            EngineCreate creator = (EngineCreate)engineList.get(0);

            List<Synthesizer> bagOfSynthesizers = new LinkedList<Synthesizer>();

            int numberSynthesizers=1;
            for (int i = 0; i < numberSynthesizers; i++) {
                synthesizer = (Synthesizer)creator.createEngine();
                bagOfSynthesizers.add(synthesizer);
                synthesizer.allocate();
                synthesizer.resume();
                desc = (SynthesizerModeDesc)  synthesizer.getEngineModeDesc();
            }




            Voice[] voices = desc.getVoices();
            Voice voice = null;
            for (int i = 0; i < voices.length; i++)
            {
                if (voices[i].getName().equals(voiceName))
                {
                    voice = voices[i];
                    break;
                }
            }
            synthesizer.getSynthesizerProperties().setVoice(voice);
            System.out.print("Speaking : "+speaktext);
            synthesizer.speakPlainText(speaktext, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.deallocate();


        }
        catch (Exception e)
        {
            String message = " missing speech.properties in " + System.getProperty("user.home") + "n";
            System.out.println(""+e);
            System.out.println(message);
        }
    }

}