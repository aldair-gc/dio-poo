# dio-poo

## Classes Diagram

```mermaid
classDiagram
  class IPad {
    <<interface>>
    +Void play()
    +Void pause()
    +Void selectMusic()
  }

  class Phone {
    <<interface>>
    +Void call(String phoneNumber)
    +Void answer()
    +Void voiceMail()
  }

  class Browser {
    <<interface>>
    +Void showPage(String url)
    +Void newTab(String url)
    +Void refreshPage()
  }

  class IPhone {
  }

  IPad <|.. IPhone
  Phone <|.. IPhone
  Browser <|.. IPhone
```
