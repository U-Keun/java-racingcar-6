package racingcar.view;

import racingcar.util.Validator;

public interface View {
    static View generateInputView(final Validator inputValidator) {
        return new InputView(inputValidator);
    }
    static View generateOutputView() {
        return new OutputView();
    }
}
