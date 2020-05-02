package TheBills;

import java.util.Locale;
import javax.speech.Engine;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class TTSHelper {
    public static void resolveText(String tts){
        try{
            System.setProperty(
                      "freetts.voices",
                      "com.sun.speech.freetts.en.us"
                          + ".cmu_us_kal.KevinVoiceDirectory");
      
                  //Engine
                  Central.registerEngineCentral(
                      "com.sun.speech.freetts"
                      + ".jsapi.FreeTTSEngineCentral");
      
                  //Synthesizer
                  Synthesizer syn
                      = Central.createSynthesizer(
                          new SynthesizerModeDesc(Locale.US));
      
                  // Allocate synthesizer
                  syn.allocate();
      
                  // Resume Synthesizer
                  syn.resume();
      
                  // Speaks the text
                  syn.speakPlainText(
                      tts, null);
                  syn.waitEngineState(
                      Synthesizer.QUEUE_EMPTY);
      
                  // Deallocate
                  syn.deallocate();
          }
          catch (Exception e) {
            e.printStackTrace();
          } 
    }
}