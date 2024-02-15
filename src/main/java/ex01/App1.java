package ex01;

import ex01.model.User;

public class App1 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData1 dbData = new DBData1(1, "제목1", "내용1", 3, "love", "love@nate.com");

        // 2. dbData1를 ViewData1에 옮기시오 - ORM
        ViewData1 viewData1 = new ViewData1();
        viewData1.setBoardId(dbData.getBoardId());
        viewData1.setTitle(dbData.getTitle());
        viewData1.setContent(dbData.getContent());
        System.out.println("viewData1: " + viewData1);

        User user = new User();
        user.setUserId(dbData.getUserId());
        user.setUsername(dbData.getUsername());
        user.setEmail(dbData.getEmail());
        System.out.println("User: " + user);

    }
}
