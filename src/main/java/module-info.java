module com.jpro.simplechat {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.jpro.simplechat to javafx.fxml;
  exports com.jpro.simplechat;
}