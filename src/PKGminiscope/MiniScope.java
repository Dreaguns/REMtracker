package REMtracker.src.PKGminiscope;
/**
 * MiniScope instantiates other framework classes such as:
 * (MiniScopeDataModel, MiniScopeTimerTask, Channel & MiniScopeEventRelayer)
 *
 * @author Basel Dadsi
 * @author Benjamin Dow
 * @author Julio Renta
 * @version 1.0
 * @since   2018-NOV-20
 */

public class MiniScope {

    //Constructor with no arguments instantiates associative classes
    MiniScope(){
        MiniScopeDataModel miniScopeDataModel = new MiniScopeDataModel();
        MiniScopeTimerTask miniScopeTimerTask = new MiniScopeTimerTask();
        MiniScopeEventRelayer miniScopeEventRelayer = new MiniScopeEventRelayer();
        Channel scopeChannel = new Channel();
    }
}
