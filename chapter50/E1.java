public class E1{


    double width;
    double length;
    double height;



    // Constructors

    public E1(double width, double height, double length){

        this.width = width;
        this.height = height;
        this.length = length;

    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getLength(){
        return this.length;
    }


    // Setters

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setLength(double length){
        this.length = length;
    }



    // Methods

    public double volume(){

        return length * width * height;

    }

    public double area(){
        this.height = height;
        this.length = length;
        this.width = width;

        return length * width * 2 + length * height * 2 + width * height * 2;


    }


    public double topArea(){

        return this.length * this.width;
    
    
    
    
    }
    public double sideArea(){
        
        return this.height * this.width;
        
        
        
        
    }
    
    
    public double otherSideArea(){
            
        return this.length * this.height;
            
            
            
            
    }


    public boolean checkFitsIn(double box1Width, double box2Width, double box1Height, double box2Height, double box1Length, double box2Length){


        if(box1Height < box2Height && box1Length < box2Length && box1Width < box2Width){
            return true;
        }

        if(box1Height > box2Height && box1Length > box2Length && box1Width > box2Width){
            return true;
        }

        return false;


    }






}