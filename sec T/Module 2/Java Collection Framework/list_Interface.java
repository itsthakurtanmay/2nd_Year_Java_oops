                            //1. ArrayList
                            import java.util.LinkedList;

                            public class list_Interface {
                                public static void ArrayList_demo(){
                                    // ArrayList<Integer>al = new ArrayList<>();
                                    LinkedList<Integer>al = new LinkedList<>();

                                    //1. Adding in ArrayList
                                    al.add(12);
                                    al.add(13);
                                    al.add(14);
                                    al.add(15);

                                    //2. Printing ArrayList
                                    System.out.println(al);

                                    //3. Adding element at particular index;
                                    al.add(2,88);
                                    System.out.println(al);

                                    //size of arraylist;
                                    int n = al.size();
                                    System.out.println("this is the size of arrayList "+n);

                                    //get Method 
                                    System.out.println(al.get(3));

                                    //set Method in arrayList;
                                    al.set(0, 9999);
                                    System.out.println("Here we set the value at the oth index "+ al);


                                }

                                public static void main(String[] args) {
                                    ArrayList_demo();
                                    
                                }
                            }