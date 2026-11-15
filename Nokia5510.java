import java.util.Scanner;
  public class Nokia5510{
     public static void main(String[]args){
  Scanner inputs = new Scanner(System.in);
  
String prompt = """
============= wellcome to Nokia ===================
 <<<<<< getting started >>>>>>>>>>>
 
 <<<<<<< MAIN MENU >>>>>>
1: phone book
2: messages
3: chat
4: call register
5: tones
6: settings
7: call divert
8: music
9: games
10: calculator
11: Remainder
12: clock
13: profiles
14: WAP service
15: SIM service
0: exit
""";
   System.out.println("enter a number to choose");
    System.out.println(prompt);
int choice = inputs.nextInt();
  switch(choice){
case 1: phoneBook(inputs);
      break;
case 2: messeges(inputs);
      break;
case 3: chat(inputs);
     break;
case 4: callRegister(inputs);
     break;
case 5: tones(inputs);
     break;
case 6: settings(inputs);
    break;
case 7: callDivert(inputs);
  break;
case 8: music(inputs);
    break;
case 9: games(inputs);
    break;
case 10: calculator(inputs);
    break;
case 11: Reminder(inputs);
    break;
case 12: clock(inputs);
    break;
case 13: profiles(inputs);
    break;
case 14: WAPservice(inputs);
   break;
case 15: SIMservices(inputs);
   break;
case 0: EXIT(inputs);
    System.out.println("Goodbye");
   return;
 default:
    System.out.print("invalid choice");
    
    }
   }
}

 public static void phoneBook(Scanner inputs){
   string phoneBookMenu = """
     ======== PHONE BOOK MENU =======
     1. Search
     2. Service Nos. 1
     3. Add name
     4. Erase
     5. Edit
     6. Copy
     7. Assign tone
     8. Send b’card
     9. Options 
     10. Speed dials
     11. Voice tags
     0.  back """;
     
  System.out.ptintln(phoneBookMenu);
  System.out.println("enter a number to choose");
  int PhoneBookChoice = inputs.nextInt();

  switch(PhoneBoookChoice){
case 1:
    System.out.println("Record added successfully");
  break;
case 2:
   System.out.println("Record added successfully");
  break;  
case 3:
  System.out.println("Record added successfully");
 break;
case 4:
  System.out.println("Record added successfully");
  break;
case 5:
  System.out.println("Record added successfully");
  break; 
case 6:
  System.out.println("Record added successfully");
  break;
case 7:
   System.out.println("Record added successfully");
  break; 
case 8:
  System.out.println("Record added successfully");
  break;
case 9:
    System.out.println("memory in use");
    System.out.println("type of veiw");
    System.out.println("memory status");
  break;
case 10:
  Sysem.out.println0("Record added successfully");   
  break;
case 11:
  Sysem.out.println0("Record added successfully");   
  break;  
  }
 }

 public static void messages(Scanner inputs){
String messegesMenu = """
 ============= MESSEGES MENU ==================
           1. Write messages
           2. Inbox
           3. Outbox
           4. Picture messages
           5. Templates
           6. Smileys
           7. Message settings
           8. Info service
           9. Voice mailbox number
          10. Service command editor
          0.  BACK
================================================
================================================
          """; 
 System.out.println(messegesMenu);
 System.out.print("enter a number to choose");
 int messegesChoice = input.nextInt();
    switch(messegesChoice){
 case 1: 
    System.out.println("Record added successfully");
  break;
case 2:
    System.out.println("Record added successfully");
  break;
case 3:
    System.out.println("Record added successfully");
  break;
case 4:
    System.out.println("Record added successfully");
  break;
case 5:
    System.out.println("Record added successfully");
  break; 
case 6:
    System.out.println("Record added successfully");
  break; 
case 7:  System.out.println("1. Set 12");
         System.out.println("2. Common 3");
         System.out.ptintln("0. exit");break;   
 int case7choice = inputs.nextInt();
 
  switch(case7choice){
      case 1:    system.out.println("Message centrenumber");
                 system.out.println("Messages sent as");
                 System.out.println("Message validity");break;
            
      case 2:    system.out.println("Delivery reports");
                 system.out.println("Reply via same centre");
                 System.out.println("Character support");break;
      case 0:  return;
             default: 
           System.out.print("invalid choice"); 
  }
case 8:
  System.out.println("Record added successfully");
    break;
case 9:
  System.out.println("Record added successfully");
   break;
case 10:
    System.out.println("Record added successfully");
  break;   
case 0: return;
    default:
    System.out.println("invalid choice");
 }
 
public static void chat(Scanner inputs){
  String chatMenu = """
=========== CHAT MENU ===============
   1: Chat    
""";
  System.out.print(chatMenu);
}

public static void callRegister(Scanner inputs){
    String callRegisterMenu = """
========== CALL REGISTER MENU =============
      1. Missed calls
      2. Received calls
      3. Dialled numbers
      4. Erase recent call lists
      5. Show call duration 
      6. Show call costs
      7. Call cost settings
      8. Prepaid credit
      0. BACK
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
============================================
  """;
  System.out.println("enter a number to choose");
  System.out.println(callRegisterMenu);
  int chatChoice = inputs.nextInt();
     
       switch(chatChoice){
case 1:  
  System.out.println("Record checked successfully");
 break;
case 2:  
  System.out.println("Record checked successfully");
break;
case 3:  
  System.out.println("Record checked successfully");
  break;
case 4:  
   System.out.println("Record checked successfully");
  break;
case 5:  
        System.out.println("Last call duration");
        System.out.println("All calls’ duration");
        System.out.print("Received calls’ duration");
        System.out.print("Dialled calls’ duration");
        System.out.println("Clear timers"); 
            break;
case 6: 
                 System.out.println("Last call cost");
                 System.out.print("All calls’ cost");
                 System.out.print("Clear counters"); 
              break;
case 7:    
    System.out.println("1. Call cost limit"); 
    System.out.println("2. Show costs in"); 
  break;
case 8:  
     System.out.println("Record checked successfully");
case 0:
    system.out.print("goodbye");
  return;
 default
     System.out.print("invalid choice");
     
     } 
 public static void tones(Scanner inputs){
   String tonesMenu = """
   
========== TONES MENU ==============
    1. Ringing tone
    2. Ringing volume
    3. Incoming call alert
    4. Message alert tone
    5. Keypad tones
    6. Warning tones
    7. Vibrating alert
    8. Screen saver
""";  
  System.out.print(tonesMenu);
}  

public static void settings(Scanner input);
   String settingsMenu = """
 <<<<<<<<<<<<<< SETTINGS MENU >>>>>>>>>>>>>>>
      1. Call settings
      2. Phone settings
      3. Security settings
      4. Restore factory settings
      0. BACK
=========""";
   System.out.println("enter a number to choose");
   System.out.println(settingsMenu);
 int settingsMenu = input.nextInt(); 
     
     switch(settingsMenu){
case 1:
       System.out.println("1.Automatic redial");
        System.out.println("2.Speed dialling");
         System.out.println("3.Call waiting options");
           System.out.println("4.Own number sending");
            Sytem.out.println("5.Phone line in use");
             System.out.println("6.Automatic answer");
        break;
case 2:  
       System.out.println("1.Language");
        System.out.println("2.Cell info display");
         System.out.println("3.Welcome note");
           System.out.println("4.Network selection");
          Sytem.out.println("5.Confirm SIM service actions");
        break;
case 3:
       System.out.println("1.PIN code request");
        System.out.println("2.Call barring service");
         System.out.println("3.Fixed dialling");
           System.out.println("4.Closed user group");
            Sytem.out.println("5.Security level");
             System.out.println("6.Change access codes");
        break;
case 4:  
    System.out.println("settings checked successfully"); 
   break; 
case 0:
    System.out.println("goodbye");
   return;
     default
 System.out.println("invalid choice");
     }

 public static void callDivert(Scanner inputs){
      String callDivertMenu = """
<<<<<<<<  CALL DIVERT MENU >>>>>>>>>>>      
    1 Call divert 1  
 """;
 System.out.print(callDivertMenu); 
}


public static void music(Scanner inputs){
   String musicMenu = """
============ MUSUC MENU ===========
    1. Music player
    2. Radio
    3. Recorder
    4. Track list
""";
  System.out.print(musicMenu);
}

 public static void games(Scanner inputs); 
   String gamesMenu = """
======= GAMES MENU =======
  1: Games
""";
System.out.print(gamesMenu);

}


public static void calculator(Scanner inputs){
   String calculatorMenu = """
======= CALCULATOR MENU =======
  1: calculator
""";
System.out.print(calculatorMenu);
  }
  

public static void Reminder(Scanner inputs){
   String ReminderMenu = """
======= REMAINDER MENU =======
  1: Reminder
""";
System.out.print(ReminderMenu);
  }

public static void Clock(Scanner inputs){
  String ClockMenu = """
<<<<<<<<<< CLOCK MENU >>>>>>>>>>>
  1. Alarm clock
  2. Clock settings
  3. Date setting
  4. Stopwatch
  5. Countdown timer
  6. Auto update of date and time
 """;
 System.out.print(ClockMenu); 
}

public static void Profiles(Scanner inputs){
   String ProfilesMenu = """
======= PROFILES MENU =======
  1: Profiles
""";
System.out.print(ProfilesMenu);
  }
  
public static void Services(Scanner inputs){
   String ServicesMenu = """
======= SERVICES MENU =======
  1: Services
""";
System.out.print(ServicesMenu);
  }

public static void SIM services (Scanner inputs){
   String SIMservicesMenu = """
======= SIM SERVICE MENU =======
  1: SIM services
""";
System.out.print(SIMservicesMenu);
  }
  

}

}
 
 
 
 
 
 
 
 
 
 
 
 }
























/* String phoneBook =        
   """
<<<<< PHONE BOOK MENU >>>>>
  1. Search
  2. Service Nos. 1
  3. Add name
  4. Erase
  5. Edit
  6. Copy
  7. Assign tone
  8. Send b’card
  9. options
  10. speed dials
  11. voice tags
  0. back
  """;
  System.out.println(phoneBook);
  System.out.println("enter a number to choose");
  switch(phoneBook){
     
case 1:   
    System.out.println("Record added successfully");
  break;
case 2:  
    System.out.println("Record added successfully");
  break;
case 3: 
    System.out.println("Record added successfully");
  break;
case 4: 
    System.out.println("Record added successfully");
  break;
case 5:
    System.out.println("Record added successfully");
  break;
case 6:
    System.out.println("Record added successfully");
  break;
case 7:
    System.out.println("Record added successfully");
  break;
case 8:
    System.out.println("Record added successfully");
  break;
case 9:
   System.out.println("1: memory of veiw")
   System.out.println("2:type of veiw")
   System.out.println("emory status")
  break;                                
case 10:
    System.out.println("Recoadded successfully");
  break;
case 11:
  System.out.println("Record successfully");
 break; 
       case 12:
         System.out.println("Recoadded succe fully");


  }
            
  
  }
   }
  } */
  
