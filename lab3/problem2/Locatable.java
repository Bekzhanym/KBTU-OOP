/** Отдельный контракт: знать координаты (не каждый Moveable обязан им отдавать наружу). */
public interface Locatable {

    double getX();

    double getY();
}
