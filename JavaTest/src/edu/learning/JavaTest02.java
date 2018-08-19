package edu.learning;

public class JavaTest02 {


    interface DibujarBien extends  Dibujar {
    }

    interface Bosquejar {
        static void subrayar(){
            int x = 5;
        }
    }

    interface Dibujar {

        void colorear();
        static void rellenar(){
            int x = 5;
        }
        //void delinear2();
        default void delinear(){
            int x = 5;
        }
    }

    class Photoshop extends Editor implements Dibujar {
        @Override
        public void colorear() {
            //DibujarBien.rellenar();
            Dibujar.rellenar();
            Editor.iniciar();
            Photoshop.iniciar();
        }
    }

    class Paint implements Dibujar, Bosquejar {
        @Override
        public void colorear() {
            Bosquejar.subrayar();
            //Paint.subrayar();
            delinear();
        }
        @Override
        public void delinear() {
        }
    }

    class Coreldraw implements Dibujar {
        @Override
        public void colorear() {
        }
    }

}

class Editor {
    static void iniciar(){};
}