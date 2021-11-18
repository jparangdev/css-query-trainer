package kr.co.the32devs.cssquerytrainer.biz.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.the32devs.cssquerytrainer.biz.questions.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
