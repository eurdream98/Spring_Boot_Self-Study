package ohgiraffers.practice02.javaconfig;

import ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean(name="member")
    public BoardDTO getMember(){
        return(new BoardDTO(2L,"스프링 수업이 앞으로 많이 어려워질까요?","그래도 포기하지 않고 열심히해볼거에요!","미래의 멋ㅈ진 개발자"));
    }
}
