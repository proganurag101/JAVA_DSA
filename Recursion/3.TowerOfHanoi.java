Que:- Three towers source,helper,destination
there are n rings.
Rule:-1 One ring is transferred in 1 step.
Rule:-2 Smaller disks are always placed on top of the larger ones.  






class TowerOfHanoi{
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        
        if(n==1){
            System.out.println("Transfer "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);  //step:-1==Source to helper,therefore helper becomes destination and viceversa.

        System.out.println("Transfer "+n+" from "+src+" to "+dest); //The lowermost disk in transferred from source to destination.

        towerOfHanoi(n-1,helper,src,dest); //now the n-1 disks transferred from helper to destination,therefore source becomes helper,helper becomes source.
        
        return;
    }

    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","H","D");

    }
}
