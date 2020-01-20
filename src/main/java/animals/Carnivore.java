package animals;

public abstract class Carnivore extends Animal {
    public boolean hunting(){
        if (!this.tired && this.food < 3 && (int)(Math.random() * 3) == 3){
            this.food += 1;
            this.tired = true;
            return true;
        }
        if (this.food >= 3){
            System.out.print("Еды слишком много!");
        }
        else if (!this.tired){
            this.tired = true;
            System.out.println("ЕДА УБЕЖАЛА :(");
        }
        else{
            System.out.println("Я устал(а)");
        }
        return false;
    }
}
