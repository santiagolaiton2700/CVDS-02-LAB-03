package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateIsDead() {
    	Person person=new Person("chester",11111111,12,Gender.FEMALE,false);
    	Assert.assertEquals(RegisterResult.DEAD,registry.registerVoter(person));
    }
    @Test
    public void ValidateUnderage() {
    	Person person=new Person("Santiago",1001169364,12,Gender.MALE,true);
    	Assert.assertEquals(RegisterResult.UNDERAGE,registry.registerVoter(person));
    }
    @Test
    public void ValidateAge() {
    	Person person=new Person("Lina",1020837962,-15,Gender.FEMALE,true);
    	Assert.assertEquals(RegisterResult.INVALID_AGE,registry.registerVoter(person));
    }
    @Test
    public void ValidateDuplicate() {
    	Person person=new Person("Lina",51901614,50,Gender.FEMALE,true);
    	RegisterResult registro = registry.registerVoter(person);
        RegisterResult registro1 = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.DUPLICATED,registro1);
    }
    @Test
    public void validateRegistryResult() {

        Person person = new Person("Valentina",13245,25,Gender.FEMALE,true);

        RegisterResult registro = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, registro);
    }
    
    
    
    
    

}