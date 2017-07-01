 package spring;
  
 public class Person {
     private IHelloMessage helloMessage;
 
     public Person() {
         //do nothing here.
     }
     
     public Person(IHelloMessage helloMessage) {
         this.helloMessage = helloMessage;
     }
     
     public IHelloMessage getHelloMessage() {
         return helloMessage;
     }
 
     public void setHelloMessage(IHelloMessage helloMessage) {
         this.helloMessage = helloMessage;
     }
     
     public String sayHello() {
         return this.helloMessage.sayHello();
     }
     
}