import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Kacinci Ayda Dogdugunuzu Giriniz");
        int month = input.nextInt();
        System.out.println("Lutfen Dogdugunuz Gunu Giriniz");
        int birthDay = input.nextInt();
        if (month == 1) {
            if (birthDay > 0 && birthDay <= 31) {
                if (birthDay <= 21) {
                    System.out.println("Oglak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            }
        } else if (month == 2) {
            if (birthDay > 0 && birthDay <= 28) {
                if (birthDay <= 19) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balik Burcu");
                }
            }


        } else if (month == 3) {
            if (birthDay > 0 && birthDay <= 31) {
                if (birthDay <= 20) {
                    System.out.println("Balik Burcu");
                } else {
                    System.out.println("Koc Burcu");
                }
            }

        } else if (month == 4) {
            if (birthDay > 0 && birthDay <= 30) {
                if (birthDay <= 20) {
                    System.out.println("Koc Burcu");
                } else {
                    System.out.println("Boga Burcu");
                }
            }

        } else if (month == 5) {
            if (birthDay > 0 && birthDay <= 31) {
                if (birthDay <= 21) {
                    System.out.println("Boga Burcu");
                } else {
                    System.out.println("Ikizler Burcu");
                }
            }
        } else if (month == 6) {
            if (birthDay > 0 && birthDay <= 30) {
                if (birthDay <= 22) {
                    System.out.println("Ikizler Burcu");
                } else {
                    System.out.println("Yengec Burcu");
                }

            } else if (month == 7) {
                if (birthDay > 0 && birthDay <= 31) {
                    if (birthDay <= 22) {
                        System.out.println("Yengec Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }

                }

            } else if (month == 8) {
                if (birthDay > 0 && birthDay <= 31) {
                    if (birthDay <= 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Basak Burcu");
                    }
                }

            } else if (month == 9) {
                if (birthDay > 0 && birthDay <= 30) {
                    if (birthDay <= 22) {
                        System.out.println("Basak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                }

            } else if (month == 10) {
                if (birthDay > 0 && birthDay <= 31) {
                    if (birthDay <= 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                }

            } else if (month == 11) {
                if (birthDay > 0 && birthDay <= 30) {
                    if (birthDay <= 21) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                }

            } else if (month == 12) {
                if (birthDay > 0 && birthDay <= 30) {
                    if (birthDay <= 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oglak Burcu");
                    }
                }

            }else
            {
                System.out.println("Hatali Tarih Girdiniz");
            }
        }
    }
}