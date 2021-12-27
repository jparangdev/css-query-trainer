package kr.co.the32devs.cssquerytrainer.biz.questions.web;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;
import kr.co.the32devs.cssquerytrainer.biz.questions.dto.QuestionDetailDto;
import kr.co.the32devs.cssquerytrainer.biz.questions.dto.QuestionListDto;
import kr.co.the32devs.cssquerytrainer.biz.questions.service.QuestionService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

	public final QuestionService questionService;

	@GetMapping("/{id}")
	public ResponseEntity<QuestionDetailDto> detail(@PathVariable("id") Long id) {
		return ResponseEntity.ok(questionService.findById(id));
	}

	@GetMapping()
	public ResponseEntity<QuestionListDto> listAll(@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "20") int size) {
		Pageable pageable = PageRequest.of(page,size, Sort.by("level"));
		return ResponseEntity.ok(questionService.find(pageable));
	}



}
