

import com.rameses.osiris2.test.OsirisTestPlatform;
import java.util.HashMap;
import java.util.Map;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } catch(Exception ex) {;}
        
        Map conf = new HashMap();
        conf.put("app.host","localhost:8072");
        conf.put("app.context","etracs25"); //bpls
        conf.put("app.custom","buk");
        conf.put("ws.host","localhost:8063");
        //conf.put("app.host","192.168.2.100:8070");
        //conf.put("app.context","etracs25");
        conf.put("app.cluster","osiris3");
        conf.put("app.debug",true);
        
        //conf.put("ws.host","localhost:8060");
        
        /*
        conf.put("app.custom","iligan");
        conf.put("report.custom","iligan");
        */
        //OsirisTestPlatform.setConf(conf);
        OsirisTestPlatform.runTest(conf, new HashMap(), new HashMap());
        
    }
    
}
