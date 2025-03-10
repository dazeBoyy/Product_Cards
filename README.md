# Слайдер товаров с категориями

Этот проект демонстрирует, как создать слайдер товаров, который динамически меняется в зависимости от выбранной категории. Данные загружаются с внешнего JSON API, а макет разработан таким образом, чтобы отображать категории товаров и соответствующие товары в виде слайдера. Приложение позволяет пользователю взаимодействовать с категориями, переключаться между ними и просматривать связанные с ними товары в формате карусели.

## Функции:

- **Динамическая загрузка данных**: Данные загружаются с удалённого JSON API: [API URL](https://szorin.vodovoz.ru/newmobile/glavnaya/super_top.php?action=topglav).
- **Вкладки категорий**: Категории динамически генерируются на основе ответа JSON и отображаются в виде кликабельных вкладок в верхней части экрана. При клике на вкладку отображаемые товары обновляются.
- **Слайдер товаров**: Товары для выбранной категории отображаются в горизонтально прокручиваемом слайдере. Пользователи могут прокручивать товары в обе стороны.
- **Подсветка активной вкладки**: Выбранная категория подсвечивается, чтобы указать на активную вкладку.
- **Обработка ошибок**: Если в ответе API статус "Error", секция с категориями скрывается.
- **Адаптивный дизайн**: Макет адаптируется под различные размеры экрана, обеспечивая правильное отображение товаров и категорий на мобильных устройствах.

## Скриншоты:
![image](https://github.com/user-attachments/assets/cb0bde17-4f31-40db-9338-8710182aaf7c)
![image](https://github.com/user-attachments/assets/4f9038ec-b1a3-4470-87d2-4dcd7faba4e9)


## Требования:

- Java 8 или выше
- Android SDK
- Android Studio

## Установка:

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/dazeBoyy/Product_Cards.git

## Полное видео работы :
https://files.fm/u/7wy4pev7s9

## Видео демонстрация работы:
![Screen_recording_20250114_055953](https://github.com/user-attachments/assets/f9ed1410-0447-4342-b8bb-de77aa1f6b78)
