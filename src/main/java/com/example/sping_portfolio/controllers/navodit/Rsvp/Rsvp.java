package com.example.sping_portfolio.controllers.navodit.Rsvp;

public class Rsvp {

    boolean m_rsvp;
    int m_selection;
    String option1;

    public Rsvp(boolean rsvp, int selection) {
        m_rsvp = rsvp;
        m_selection = selection;

    }

    public String dinner(){
        if(m_rsvp){
           if(m_selection == 1){
               option1 = "Thanks for attending. You will be served beef.";
               return option1;
           }
           if(m_selection == 2){
               option1 = "Thanks for attending. You will be served Chicken.";
               return option1;
            }
            if(m_selection == 3){
                option1 = "Thanks for attending. You will be served Pasta.";
            }
            else{
                option1="Thanks for attending. You will be served Fish.";
            }
        }
        else{
            option1="Sorry you can't make it";
        }
        return option1;

    }
}
