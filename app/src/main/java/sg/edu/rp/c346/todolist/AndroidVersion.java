package sg.edu.rp.c346.todolist;

public class AndroidVersion {
    private String todo;
    private String date;

    public AndroidVersion(String todo, String date){
        this.todo = todo;
        this.date = date;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return (todo + ":" + date);
    }
}
