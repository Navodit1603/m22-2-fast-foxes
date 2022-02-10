package com.example.sping_portfolio.controllers.navodit.LightSequence;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LightSequence {
// attributes not shown

    /** The parameter seq is the initial sequence used for
     * the light display
     */
    String m_seq;
    public LightSequence(String seq) {
        /* implementation not shown */
        m_seq = seq;
    }
    /** Inserts the string segment in the current sequence,
     * starting at the index ind. Returns the new sequence.
     */
    public String insertSegment(String segment, int ind)
    { /* implementation not shown */
        String newString =  m_seq.substring(0, ind + 1) + segment + m_seq.substring(ind + 1);
        return newString;
    }
    /** Updates the sequence to the value in seq
     */
    public void changeSequence(String seq)
    {
        m_seq = seq;
    }
    /** Uses the current sequence to turn the light on and off
     * for the show
     */
    public void display()
    { /* implementation not shown */
        System.out.println(m_seq);
    }
    public String getSeq (){
        return m_seq;
    }
    public String updateSequence(String newString){
        String seq_updated = newString;
        return seq_updated;
    }
    public String deleteSequence(String delete){
        String seq_deleted = m_seq.replace(delete, "");
        return seq_deleted;
    }



    public Double triangle(Double a, Double b){
        Double c = Math.sqrt(a*a+b*b);
        return c;
    }

}