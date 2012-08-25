/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asserts.unit.test;

/**
 *
 * @author user
 */
public class AssessmentUnit implements AssertMethod{
    
    private String[][] AssertItems = null;
    
    @Override
    public void AssertMethod(){
        
    }
    
    @Override
    public void setAssertList(String[][] arrayItems){
        
        int countRow = arrayItems.length;
        this.AssertItems = new String[countRow][5];

    }

    @Override
    public boolean startAssessment() {
        
        return true;
    }
    
}
