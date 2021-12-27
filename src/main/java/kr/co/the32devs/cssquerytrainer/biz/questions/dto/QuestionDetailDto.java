package kr.co.the32devs.cssquerytrainer.biz.questions.dto;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;

public class QuestionDetailDto {

	private int level;
	private String title;
	private String text;

	public QuestionDetailDto(int level,String title, String text) {
		this.level = level;
		this.title = title;
		this.text = text;
	}

	public static QuestionDetailDto from(Question question) {
		return new QuestionDetailDto(question.getLevel(), question.getTitle(), question.getText());
	}
}
