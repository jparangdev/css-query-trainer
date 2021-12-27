package kr.co.the32devs.cssquerytrainer.biz.questions.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;
import kr.co.the32devs.cssquerytrainer.common.enums.YNCode;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	Page<Question> findByDelYn(YNCode n, Pageable pageable);
}
