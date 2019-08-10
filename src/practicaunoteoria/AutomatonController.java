package practicaunoteoria;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Juan Gutierrez
 */
public class AutomatonController {

    private FA myAutomaton = new FA();

    /*
     * Verifica si el estado que se ingresa de primero sí es efectivamente el inicial
     */
    public boolean isFirstStateInitial(String[] states) {
        return states[0].contains("!");
    }

    public FA getMyAutomaton() {
        return myAutomaton;
    }

    /*
     * Asigna los estados al autómata con base en la hilera que ingresó el usuario
     * Esta hilera anteriormente se convirtió en arreglo de string.
     * Si el estado tiene un "." al inicio es de aceptación, si no lo tiene, es de rechazo
     * Si el estado tiene un "!" es el estado inicial, estrictamente tiene que ser el primer 
     * símbolo que se ingrese.
     */
    public void setStates(String[] states) {
        boolean accepting;
        ArrayList<State> automatonStates = new ArrayList<>();
        String symbol;
        boolean initial;
        for (int j = 0; j < states.length; j++) {
            accepting = false;
            initial = false;
            if (states[j].contains(".")) {
                accepting = true;
                if (states[j].contains("!")) {
                    symbol = states[j].substring(states[j].indexOf(".") + 1, states[j].length() - 1);
                    if (j == 0) {
                        initial = true;
                    }
                } else {
                    symbol = states[j].substring(states[j].indexOf(".") + 1, states[j].length());
                }
            } else if ((states[j].contains("!") && initial == false)) {
                symbol = states[j].substring(0, states[j].length() - 1);
                if (j == 0) {
                    initial = true;
                }
            } else {
                symbol = states[j].substring(0, states[j].length());
            }
            State state = new State(symbol, accepting, initial);
            automatonStates.add(state);
        }
        myAutomaton.setStates(automatonStates);
    }

    public void setInitialBeginning(ArrayList<ArrayList<State>> setStates) {
        ArrayList<State> aux1;
        State aux3;
        ArrayList<State> aux2;
        for (int i = 0; i < setStates.size(); i++) {
            aux1 = setStates.get(i);
            for (int j = 0; j < aux1.size(); j++) {
                aux3 = aux1.get(j);
                if (aux3.isInitialState()) {
                    aux2 = setStates.get(0);
                    setStates.set(0, aux1);
                    setStates.set(i, aux2);
                    return;
                }
            }
        }
    }

    public void setSymbols(String[] symbols) {
        ArrayList<String> automatonSymbols = new ArrayList<>();
        automatonSymbols.addAll(Arrays.asList(symbols));
        myAutomaton.setInputSymbols(automatonSymbols);
    }

    public void separateStates(ArrayList<ArrayList<State>> setStates) {
        ArrayList<State> Astates = new ArrayList<>();
        ArrayList<State> Rstates = new ArrayList<>();
        for (int i = 0; i < myAutomaton.getStates().size(); i++) 
            if (myAutomaton.getStates().get(i).isAcceptingState()) 
                Rstates.add(myAutomaton.getStates().get(i));
             else 
                Astates.add(myAutomaton.getStates().get(i));
        setStates.add(Astates);
        setStates.add(Rstates);
    }

    public void setTransitions(ArrayList<ArrayList<String>> transitions) {
        myAutomaton.setTransitions(transitions);
    }

    public ArrayList<ArrayList<String>> getTransitions() {
        return myAutomaton.getTransitions();
    }

    public void setMyAutomaton(FA myAutomaton) {
        this.myAutomaton = myAutomaton;
    }
}
