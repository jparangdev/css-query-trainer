package kr.co.the32devs.cssquerytrainer.biz.questions.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;
import kr.co.the32devs.cssquerytrainer.biz.questions.dto.QuestionDetailDto;
import kr.co.the32devs.cssquerytrainer.biz.questions.dto.QuestionListDto;
import kr.co.the32devs.cssquerytrainer.biz.questions.repository.QuestionRepository;
import kr.co.the32devs.cssquerytrainer.common.enums.YNCode;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	QuestionRepository questionRepository;

	public QuestionDetailDto findById(long id) {
		return QuestionDetailDto.from(questionRepository.findById(id).orElseThrow());
	}

	public QuestionListDto find(Pageable pageable) {
		Page<Question> questions = questionRepository.findByDelYn(YNCode.N, pageable);
		QuestionListDto result = new QuestionListDto(questions.getTotalElements(), questions.toList());
		return result;
	}



}
