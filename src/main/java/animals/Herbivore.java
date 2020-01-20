package animals;

public abstract class Herbivore extends Animal {
    int pinches;

    public boolean pinchWeed(){
        if (!this.tired && this.food < 4){
            this.food += 1;
            this.pinches += 1;
            if (this.pinches % 2 == 0){
                this.tired = true;
                this.pinches = 0;
            }
            return true;
        }
        if (this.food >= 4){
            System.out.println("У меня много травы");
            return false;
        }
        System.out.println("Я устал(а)");
        return false;
    }
}
