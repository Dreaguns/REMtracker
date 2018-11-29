package REMtracker.src.PKGremtracker;

import REMtracker.src.PKGminiscope.MiniScopeDataModel;

/**
 * REMtrackerDataModel inherits from PKGminiscope's MiniScopeDataModel
 * One instance for "RAWdata" and another for "DFT"
 * This class also instantiates the WifiHandler & SerialHandler classes
 * Loads data from Serial to RAWdata
 * Loads data from RAWdata to DFT
 * Future work can include:
 *  - creating, saving & loading profiles
 *  - saving for each profile
 *
 *
 * @author Basel Dadsi
 * @author Benjamin Dow
 * @author Julio Renta
 * @version 1.0
 * @since   2018-NOV-22
 */
public class REMtrackerDataModel {

    //Constructor with no arguments
    public REMtrackerDataModel(){
        MiniScopeDataModel miniScopeDataModel = new MiniScopeDataModel();
        WiFiHandler wiFiHandler = new WiFiHandler();
        SerialHandler serialHandler = new SerialHandler();
    }
}
