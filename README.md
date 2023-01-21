<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">MDM App Config</h3>
<p align="center"><strong><code>@capacitor-community/mdm-app-config</code></strong></p>
<p align="center">
  Capacitor community plugin for reading app configurations written by a MDM (see <a href="https://www.appconfig.org/">appconfig.org</a>) such as VMWare Workspace One.
</p>

## Maintainers

| Maintainer | GitHub | Social |
| -----------| -------| -------|
| Damian Tarnawsky | [dtarnawsky](https://github.com/dtarnawsky) | [@damiantarnawsky](https://twitter.com/damiantarnawsky) |

## Versions

| Plugin | Capacitor | Documentation                                                                     |
| ------ | --------- | --------------------------------------------------------------------------------- |
| 4.x    | 4.x       | [README](https://github.com/capacitor-community/mdm-app-config/blob/main/README.md) |

## Installation

```bash
npm install @capacitor-community/mdm-app-config
npx cap sync
```
## Configuration

No configuration required for this plugin

## Usage
```typescript
import { AppConfig } from '@capacitor-community/mdm-app-config';

// Get a value:
const result = await AppConfig.getValue({ key: 'my.variable.name' });
console.log(result.value);
```

## API

<docgen-index>

* [`getValue(...)`](#getvalue)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getValue(...)

```typescript
getValue(options: getValueOptions) => Promise<GetValueResult>
```

Get a value from App Config. On iOS, values are obtained from UserDefaults in com.apple.configuration.managed.

| Param         | Type                                                        | Description          |
| ------------- | ----------------------------------------------------------- | -------------------- |
| **`options`** | <code><a href="#getvalueoptions">getValueOptions</a></code> | Options to get value |

**Returns:** <code>Promise&lt;<a href="#getvalueresult">GetValueResult</a>&gt;</code>

**Since:** 1.0.0

--------------------


### Interfaces


#### GetValueResult

| Prop        | Type                | Description | Since |
| ----------- | ------------------- | ----------- | ----- |
| **`value`** | <code>string</code> | The value   | 1.0.0 |


#### getValueOptions

| Prop      | Type                | Description                | Since |
| --------- | ------------------- | -------------------------- | ----- |
| **`key`** | <code>string</code> | The key (or variable name) | 1.0.0 |

</docgen-api>
