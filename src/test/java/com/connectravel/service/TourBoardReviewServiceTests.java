package com.connectravel.service;

import com.connectravel.dto.QnaBoardDTO;
import com.connectravel.dto.TourBoardDTO;
import com.connectravel.dto.TourBoardReivewDTO;
import com.connectravel.entity.TourBoard;
import com.connectravel.repository.TourBaordImgRepository;
import com.connectravel.repository.TourBoardRepository;
import groovy.util.logging.Log4j2;
import javassist.NotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@SpringBootTest//스프링부트 테스트 명시
@Log4j2//로그 사용 명시
public class TourBoardReviewServiceTests {

    @Autowired
    TourBoardReviewService tourBoardReviewService;

    @Test // 가이드 댓글 추가 테스트
    public void testRegisterTourBoardReview() {

        String[] sampleReviews = { // 질문을 배열로 저장
                "정말 아름다운 곳이었어요. 풍경이 환상적입니다!",
                "자연 속에서 힐링하는 시간을 가질 수 있어 좋았어요.",
                "인근의 맛집과 관련해서도 많은 정보를 얻을 수 있었습니다.",
                "주변 풍경이 아름다워 사진찍기에 좋았어요.",
                "특별한 경험을 만들어준 관광지입니다. 감사합니다!"
        };

        IntStream.rangeClosed(1, 5).forEach(i -> { // 10번 반복
            TourBoardReivewDTO tourBoardReivewDTO = new TourBoardReivewDTO(); // 테스트 tourBoardReivewDTO 생성
            tourBoardReivewDTO.setTbno(1L); // 게시글 입력
            tourBoardReivewDTO.setContent(sampleReviews[i - 1]); // 댓글 내용 입력
            tourBoardReivewDTO.setGrade(5D); // 평점 입력
            tourBoardReivewDTO.setWriterEmail("sample@sample.com"); // 작성자 이메일 입력

            Long tbrno = null; // 게시글 등록 register 메서드 호출
            try {
                tbrno = tourBoardReviewService.register(tourBoardReivewDTO); // 리뷰 등록 메서드 실행
            } catch (Exception e) {
                throw new RuntimeException(e); //예외처리
            }
            System.out.println(tbrno + "번 게시물 등록");
        });
    }

    @Test // 게시글 조회 테스트
    public void testGetTourBoardReview() {
        Long bno = 1L; // 테스트 게시글 번호

        TourBoardReivewDTO result = tourBoardReviewService.get(bno); // 게시글 조회 get 메서드 호출

        System.out.println(bno + "번 게시글");
        System.out.println("TourBoardReview 정보: " + result.toString());
        System.out.println("Member 정보: " + result.getWriterEmail() + ", " + result.getWriterName());
    }
}









