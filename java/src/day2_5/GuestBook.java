package day2_5;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GuestBook {
	private Long gno;
	@Setter
	private String content;
	private String writer;
	
//	LocalDate, LocalDateTime
	private LocalDateTime writeTime;
}
