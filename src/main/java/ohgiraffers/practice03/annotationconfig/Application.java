package ohgiraffers.practice03.annotationconfig;

import ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
BoardDAO boardDAO = context.getBean(BoardDAO.class);
        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L,"요즘 힘드니?","나좀 지친거일 수도..","고동환")));
        System.out.println(boardDAO.selectBoard(3L));

    }
}
