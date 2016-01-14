/* In this problem, we need simulate a customer call employee. Therefore, we need
 implement several class to represent Call, different employee, and Caller*/
public class CallCentre {
  private static CallCentre instance;
  private final int LEVELS = 3;
  private final int NUM_RESPONDENTS = 10;
  private final int NUM_MANAGERS = 4;
  private final int NUM_DIRECTORs = 2;
  List<List<Employee>> employees;
  List<List<Call>> callQueue;
  protected CallCentre () {

  }
  public static CallCentre getInstance() {
    if (instance == null) instance = new CallCentre();
    return instance;
  }
  // get the first available employee who are free and can handle this call
  public Employee getHandler(Call call) {

  }
  public void dispatchCall(Caller caller) {

  }
  public void dispatchCall(Call call) {
    Employee emp = getHandler(call);
    if (emp == null) {
      call.reply("Please wait for free agents");
      callQueue.get(call.getRank()).add(call);
    } else {
      emp.receiveCall(call);
      call.setHandler(emp);
    }
  }
  public boolean canAssignCall(Employee emp) {
    // search the list of list for free employee. If found return true, otherwise return false
  }
}
public class Caller {
  private String name;
  private int  age;
  private String phoneNum;
  private String address;
  public Caller(String name, int age, String phoneNum, String address {
      this(name, age, phoneNum, address);
    })
      }

public class Call {
  // build a nested class to represent caller
  private int rank;
  private Caller caller;
  private Employee handler;
  public Call(Caller caller) {
    rank = Rank.Repsonder;
    this.caller = caller;
  }
  public void setHandler(Employee emp){

  }
  public void reply(String msg){

  }
  public int getRank() {
    return rank;
  }
  public int changeReank() {

  }
  public void setRank(Rank r) {

  }
  public void disconnect() {

  }
}
/* First it is necessary to design an abstract class called employee. Other position can extends from this class*/
final class Rank {
  public final int Repsonder = 0;
  public final int Manager = 1;
  public final int Director = 2;
}

abstract class Employee{
  private Call currentCall;
  private int rank;
  public Employee() {
    currentCall = null;
    rank = Rank.Repsonder;
  }
  public boolean isFree();
}

class Director extends Employee {
  public Director() {
    rank = Rank.Director;
  }
}
class Manager extends Employee {
  public Manager() {
    rank = Rank.Manager;
  }
}
class Respondent extends Employee {
  public Respondent() {
    rank = Rank.Respondent;
  }
}
