import aima.core.logic.fol.kb.data.Literal;
import aima.core.logic.planning.State;

import java.util.List;

public class State extends State {
    //Set variables for number of missionaries, cannibales, and the boat 
    int missionaries;
    int cannibals;
    int boat;
    //Was the move successful
    Boolean success;
    
public State (int numMiss, int numCannibals, int onBoat){
    missionaries = numMiss; 
    cannibals = numCannibals;
     boat = onBoat; 
    //set success to failure if a move leaves more canniabls than missionaries
     if(cannibals>missionaires) success = false; 
     if(cannibals<=missionaries) success = true; 
    
    
}
}
