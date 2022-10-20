public class robot{
    int personality;
    private int min=1;
    private int max=4;
    private String greeting, response, goodbye;
    public robot(){
        setPersonality();
    }
    private void setGoodbye(String bye){
        this.goodbye = bye;
    }
    private void setPersonality(){
		this.personality = (int) (Math.random()*(max-min)) + min;
        if(personality == 1)
        {
            greeting = "Hello beautiful.";
        }
        else if(personality==2)
        {
            greeting = "Sup.";
        }
        else if(personality==3)
        {
            greeting = "Hello weird looking robot.";
        }
    }

    public void speakTo(robot target){
        System.out.println(greeting);
        target.receive(greeting, this);
        System.out.println(goodbye);
    }

    public void receive(String msg, robot sender){
       if(msg == "Hello beautiful.")
       {
            if(personality == 1)
            {
                response = "Wow thank you you're beautiful too!";
                sender.setGoodbye("I have to go but it was so amazing to meet you!!");
            }
            else if(personality==2)
            {
                response = "Thats nice, thanks.";
                sender.setGoodbye("You are so welcome, see ya later!");
            }
            else if(personality==3)
            {
                response = "Wow, coming from you that means absolutly nothing!";
                sender.setGoodbye("Thats not very nice, have a good day anyway though!");
            }
            System.out.println(response);
            
       }
       if(msg == "Sup.")
       {
            if(personality == 1)
            {
                response = "What is up is that i am doing great!";
                sender.setGoodbye("Ok..... bye.");
            }
            else if(personality==2)
            {
                response = "Yo.";
                sender.setGoodbye("Cool, bye");
            }
            else if(personality==3)
            {
                response = "Go away";
                sender.setGoodbye("k.");
            }
            System.out.println(response);
            
       }
       if(msg == "Hello weird looking robot.")
       {
            if(personality == 1)
            {
                response = "I like to think i look fab.";
                sender.setGoodbye("You dont. Im leaving.");
            }
            else if(personality==2)
            {
                response = "Who hurt you?";
                sender.setGoodbye("You did, weirdo. Im leaving.");
            }
            else if(personality==3)
            {
                response = "You're the weird looking one weirdo";
                sender.setGoodbye("GO AWAY!");
            }
            System.out.println(response);
       }
        
    }
    @Override
    public String toString()
    {
        if(personality == 1)
            {
                return "I am nice";
            }
        else if(personality==2)
            {
                return "I am indifferent";
            }
        else if(personality==3)
            {
                return "I am mean";
            }
        else{
            return "I shouldnt exist";
        }
    }

}