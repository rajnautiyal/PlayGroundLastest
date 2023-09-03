package org.example.playground;

public class Permutations {
        public static void permutations(int[] boxes, int ci, int ritems){
            if(ci > ritems){
                for(int i = 0; i < boxes.length; i++){
                    System.out.print(boxes[i]);
                }
                System.out.println();
                return;
            }
            for(int i = 0; i < boxes.length; i++){
                if(boxes[i] == 0){
                    boxes[i] = ci;
                    permutations(boxes, ci + 1, ritems);
                    boxes[i] = 0;
                }
            }
        }

        public static void main(String[] args) throws Exception {

            int nboxes = 3;
            int ritems = 2;
            permutations(new int[nboxes], 1, ritems);
        }

    }

