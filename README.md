# mustache 샘플 파일

- https://blog.naver.com/PostView.nhn?blogId=islove8587&logNo=220989976625&parentCategoryNo=&categoryNo=44&viewDate=&isShowPopularPosts=false&from=postView

- {{값}} 데이터 전달

- {{#}} 조건문 혹은 반복문

- {{^값}} 부정(NOT)

- {{>파일명}} 부분 템플릿


## 추가 : Mustache (View Template Engine)의 기본 설정값
	* spring.mustache.prefix=classpath:/templates/ == src/main/resources/templates/
	* spring.mustache.suffix=.mustache
	* 출처 : [바로가기](https://supawer0728.github.io/2018/03/14/Mustache/)
	
	* classpath가 src/main/resources인 것은 Maven, Gradle 툴로 만든 프로젝트에서 기본 설정
	* 참고 링크 : [StackOverflow](https://stackoverflow.com/questions/34160419/spring-boot-classpath)