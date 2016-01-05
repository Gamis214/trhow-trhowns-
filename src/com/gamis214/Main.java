package com.gamis214;

public class Main {

    private void metodo1(){
        try {
            metodo2();
        }catch (Exception e){
            System.out.println("Error de metodo1: "+e.getMessage());
        }
    }

    private void metodo2() throws Exception{
        try {
            metodo3();
        }catch (Exception e){
            throw e;
        }
    }

    private void metodo3() throws Exception{
        try{
            int div = 7/0;
        }catch (Exception e){
            throw e;
        }
    }

    public static void main(String[] args) {
	    Main mn = new Main();
        mn.metodo1();
    }
}
