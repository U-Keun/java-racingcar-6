package racingcar.view;

public enum ConstantMessage {
    /*
    입력 안내 메시지
     */
    INPUT_CARS_NAME("경주할 자동차 이름을 입력하세.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_COUNT("시도할 횟수는 몇회인가요?"),
    /*
    출력 안내 메시지
     */
    RESULT_MESSAGE_START("\n실행 결과\n"),
    WINNER_IS("최종 우승자 : "),
    NEXT_LINE("\n");
    private final String message;

    ConstantMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
