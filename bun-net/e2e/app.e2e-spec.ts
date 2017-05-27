import { BunNetPage } from './app.po';

describe('bun-net App', function() {
  let page: BunNetPage;

  beforeEach(() => {
    page = new BunNetPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
