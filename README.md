# mustache 샘플 파일

- https://blog.naver.com/PostView.nhn?blogId=islove8587&logNo=220989976625&parentCategoryNo=&categoryNo=44&viewDate=&isShowPopularPosts=false&from=postView

- {{값}} 데이터 전달

- {{#}} 조건문 혹은 반복문

- {{^값}} 부정(NOT)

- {{>파일명}} 부분 템플릿


## 추가 : Mustache (View Template Engine)의 기본 설정값
	* spring.mustache.prefix=classpath:/templates/
	* spring.mustache.suffix=.mustache
	* 출처 : https://supawer0728.github.io/2018/03/14/Mustache/
	* 참고 링크 : https://docs.spring.io/spring-boot/docs/1.3.0.M1/reference/html/common-application-properties.html