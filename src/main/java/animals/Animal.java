package animals;

public abstract class Animal {
    private String  name;
    private int height;
    int food;
    private boolean hungry = true;
    boolean tired = false;



    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public String getHungry(){
        if (this.hungry){
            return "голоден(а)";
        }
        else{
            return "сыт(а)";
        }
    }


    public boolean eat(){
         if (this.hungry && this.food > 0){
             this.hungry = false;
             this.food -= 1;
             return true;
         }
         return false;
    }
    public boolean sleep(){
        if (this.tired && !this.hungry){
            this.tired = false;
            this.hungry = true;
            return true;
        }
        return false;
    }

}
