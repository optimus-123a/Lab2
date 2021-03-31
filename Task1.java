package com.company;
/* #31
Створіть метод який дозволяє фільтрувати елементи будь якого масиву int та
виводити ці елементи на консоль. Умови фільтрації повинні передаватися в
метод як параметр. Використовуйте функціональні інтерфейси та анонимні класи.
*/
public class Task1 {

    public void filterSummoner(Integer[] array){
        for(int i=0; i<array.length;i++) {
            if(filterModule.arrayFilter(array[i])==true){
                System.out.println("["+array[i]+"]");
            }
        }
    }

    FilterManager filterModule=new FilterManager() {
        @Override
        public boolean arrayFilter(Integer item) {
            boolean result=false;
            if(item%2==0){
                result=true;
            }else{
                result=false;
            }
            return result;
        }
    };

    @FunctionalInterface
    public interface FilterManager {
        public boolean arrayFilter(Integer item);
    }
    //Почему интерфейс функциональный?
}


