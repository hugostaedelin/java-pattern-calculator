import java.util.ArrayList;
import java.util.List;

public class Composite implements Operation {
    List<Operation> operationList;
    public Composite() {
        operationList = new ArrayList<Operation>();
    }

    public void addOperation(Operation op){
        operationList.add(op);
    }

    public int resultat() {
        int result = 0;
        for (Operation operation : operationList) {
            result+=operation.resultat();
        }
        return result;
    }

    public void accept(Visiteur v){
        v.visiteCompo(this);
    }

    public List<Operation> compoList(){
        return operationList;
    }
}
