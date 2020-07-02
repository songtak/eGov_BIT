package com.song.web.domains;


/**

 * @FileName : Article.java

 * @Project : 게시판

 * @Date : 2020. 7. 1.

 * @작성자 : missong342@gamil.com

 * @변경이력 :

 * @프로그램 설명 : 게시글DTO
 * articleNumber :
 * filterNumber : 
 * comment : 
 * message :
 * rating :

 */


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int articleNumber, fileNumber;
	private String userid, comment, message, rating, boardtype, title, content; 
}
