import java.io.Serializable;

public class FlashCardObject implements Serializable {
String question,answer;

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

 FlashCardObject(String question, String answer) {
	super();
	this.question = question;
	this.answer = answer;
}

public String toString(){
	return "Question is : "+question+"\nAnswer is :"+answer;
	
}



}
