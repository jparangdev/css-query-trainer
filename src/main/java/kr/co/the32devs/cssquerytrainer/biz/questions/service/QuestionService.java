package kr.co.the32devs.cssquerytrainer.biz.questions.service;

import org.springframework.stereotype.Service;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;
import kr.co.the32devs.cssquerytrainer.biz.questions.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	QuestionRepository questionRepository;

}
