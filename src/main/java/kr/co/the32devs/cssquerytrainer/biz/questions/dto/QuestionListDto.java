package kr.co.the32devs.cssquerytrainer.biz.questions.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;

public class QuestionListDto {

	long count;

	List<QuestionDetailDto> list = new ArrayList<>();


	public QuestionListDto(long count,
		List<Question> list) {
		this.count = count;
		this.list = list.stream().map(q->QuestionDetailDto.from(q)).collect(Collectors.toList());
	}
}
