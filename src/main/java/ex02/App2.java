package ex02;

import ex02.model.Reply;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData2 dbData1 = new DBData2(1, "제목1", "내용1", 1, "댓글1");
        DBData2 dbData2 = new DBData2(1, "제목1", "내용1", 2, "댓글2");
        DBData2 dbData3 = new DBData2(1, "제목1", "내용1", 3, "댓글3");

        List<DBData2> dbList = Arrays.asList(dbData1, dbData2, dbData3);

        // 2. dbList(컬렉션을) ViewData2(오브젝트)에 옮기시오 - ORM
        ViewData2 viewData1 = new ViewData2(dbData1.getBoardId(), dbData1.getTitle(), dbData1.getTitle());
        ViewData2 viewData2 = new ViewData2(dbData2.getBoardId(), dbData2.getTitle(), dbData2.getTitle());
        ViewData2 viewData3 = new ViewData2(dbData3.getBoardId(), dbData3.getTitle(), dbData3.getTitle());

        Reply reply1 = new Reply();
        Reply reply2 = new Reply();
        Reply reply3 = new Reply();

        reply1.setReplyId(dbData1.getReplyId());
        reply2.setReplyId(dbData2.getReplyId());
        reply3.setReplyId(dbData3.getReplyId());

        reply1.setComment(dbData1.getComment());
        reply2.setComment(dbData2.getComment());
        reply3.setComment(dbData3.getComment());

        List<Reply> replies = new ArrayList<>();
        replies.add(reply1);
        replies.add(reply2);
        replies.add(reply3);

        viewData1.addReply(reply1);
        viewData1.addReply(reply2);
        viewData1.addReply(reply3);

        System.out.println("replies: " + replies);
    }
}
