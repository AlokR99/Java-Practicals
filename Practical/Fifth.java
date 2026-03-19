/*
Hierarchial Inheritance
*/

class Parent{
        Parent(){
                System.out.println("In Parent class");
        }
        void hairColour(){
                System.out.println("Hair color is Black, I am "+this);
        }
}

class Child1 extends Parent{
        Child1(){
                System.out.println("In Child1 class");
        }
}

class Child2 extends Parent{
        Child2(){
                System.out.println("In Child2 claas");
        }
}

class FifthMain{
        public static void main(String[] args){
                Parent p1=new Parent();
                p1.hairColour();
                System.out.println("\n");

                Child1 c1=new Child1();
                c1.hairColour();
                System.out.println("\n");

                Child2 c2=new Child2();
                c2.hairColour();
        }
}