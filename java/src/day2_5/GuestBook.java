package day2_5;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuestBook {
	private Long gno;
	@Setter
	private String content;
	private String writer;

//	LocalDate, LocalDateTime
	private LocalDateTime writeTime;
}
